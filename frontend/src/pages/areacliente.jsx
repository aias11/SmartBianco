import React, { useState, useEffect } from 'react';
import './areacliente.css';

import treinoPerna from '../assets/perna.png';
import personal from '../assets/personal.png';


const idLogado = 2; // id do cliente logado //

// --- Componentes Menores ---

const Navbar = ({ nome }) => (
    <nav className="nav-cliente">
        <span className="material-symbols-outlined">menu</span>
        <div className="NavAccontBox">
            <img src={personal} alt="foto de perfil" />
            <h6>Olá, {nome}</h6>
        </div>
    </nav>
);

const DiaDaSemana = ({ dia, onToggle }) => (
    <div className="DiaDaSemanaBox">
        <h5>{dia.dia} <br /><span>{dia.subtitulo}</span></h5>
        <label className="custom-checkbox">
            <input
                type="checkbox"
                checked={dia.concluido}
                onChange={onToggle}
            />
            <span className="checkmark material-symbols-outlined">check</span>
        </label>
    </div>
);

const ExercicioCard = ({ titulo, musculo, imagem, series, reps, descanso, concluido }) => {
    const [checked, setChecked] = useState(concluido);

    return (
        <div className="Treino">
            <div className="TreinoBox1">
                <img className='TreinoPerna' src={imagem} alt={`Imagem do treino ${titulo}`} />
                <h6>{titulo} <br /><span>{musculo}</span></h6>
            </div>

            <div className="Series">
                <div className="IconsTreinoSerarete">
                    <span className="material-symbols-outlined" id="icontreino">weight</span>
                    <span>{series}</span>
                </div>
                <div className="IconsTreinoSerarete">
                    <span className="material-symbols-outlined" id="icontreino">refresh</span>
                    <span>{reps}</span>
                </div>
                <div className="IconsTreinoSerarete">
                    <span className="material-symbols-outlined" id="icontreino">timer</span>
                    <span>{descanso}</span>
                </div>

                <label className="MarcarTreino">
                    <input
                        type="checkbox"
                        checked={checked}
                        onChange={() => setChecked(!checked)}
                    />
                </label>
            </div>
        </div>
    );
};

const ResumoEstatisticas = ({ concluidos, total, tempo, kcal }) => (
    <div className="ResumosMainBox">
        <div className="ResumoDaSemanaBox">
            <h5 className="SubTitle">Resumo da semana</h5>
            <div className="BoxTaks">
                <div className="ResumoItem">
                    <div className="BoxIcons" style={{ backgroundColor: 'rgba(62, 197, 9, 0.904)' }} id="alinhamento">
                        <span className="material-symbols-outlined">task_alt</span>
                    </div>
                    <p>Treinos concluídos <br /> <strong>{concluidos}/{total}</strong></p>
                </div>
                <div className="ResumoItem">
                    <div className="BoxIcons" style={{ backgroundColor: 'rgb(29, 147, 194)' }} id="alinhamento">
                        <span className="material-symbols-outlined">schedule</span>
                    </div>
                    <p>Tempo total <br /> <strong>{tempo}</strong></p>
                </div>
                <div className="ResumoItem">
                    <div className="BoxIcons" style={{ backgroundColor: 'orange' }} id="alinhamento">
                        <span className="material-symbols-outlined">local_fire_department</span>
                    </div>
                    <p>Calorias Queimadas <br /> <strong>{kcal} Kcal</strong></p>
                </div>
            </div>
        </div>

        <div className="DicasDoTreinador">
            <h6 className="SubTitle">Dica do Treinador</h6>
            <div className="DicaConteudo">
                <img src={personal} alt="Foto do Treinador" className="FotoTreinador" />
                <p className='TextoDiferente'>Fazer Lentinho pra sentir queimar... <br />o cardio é lá em casa em...</p>
            </div>
        </div>
    </div>
);

// --- Componente Principal ---

export default function AreaCliente() {
    // 1. Estado para os dias da semana (para tornar os cálculos dinâmicos)
    const [diasDaSemana, setDiasDaSemana] = useState([
        { id: 1, dia: 'SEG', subtitulo: 'Perna', concluido: false },
        { id: 2, dia: 'TER', subtitulo: 'Peito', concluido: false },
        { id: 3, dia: 'QUA', subtitulo: 'Costas', concluido: false },
        { id: 4, dia: 'QUI', subtitulo: 'Inferior', concluido: false },
        { id: 5, dia: 'SEX', subtitulo: 'Superior', concluido: false },
        { id: 6, dia: 'SAB', subtitulo: 'Abdomen', concluido: false },
        { id: 7, dia: 'DOM', subtitulo: 'Descanso', concluido: false },
    ]);

    const exerciciosDePerna = [
        { id: 1, titulo: 'Agachamento Livre', musculo: 'Coxa', imagem: treinoPerna, series: 4, reps: '8-10', descanso: '90s', concluido: false },
        { id: 2, titulo: 'Mesa Flexora', musculo: 'Coxa', imagem: treinoPerna, series: 4, reps: '8-10', descanso: '90s', concluido: false },
        { id: 3, titulo: 'Leg Press 45', musculo: 'Coxa', imagem: treinoPerna, series: 4, reps: '8-10', descanso: '90s', concluido: false },
    ];

    const [cliente, setCliente] = useState(null);
    const [loading, setLoading] = useState(true);

    // 2. Cálculos baseados nos treinos concluídos
    const treinosConcluidos = diasDaSemana.filter(d => d.concluido).length;
    const totalTreinos = diasDaSemana.length;
    const tempoMinutos = treinosConcluidos * 85; // Simulando 45min por treino
    const horas = Math.floor(tempoMinutos / 60);
    const minutos = tempoMinutos % 60;
    const caloriasTotais = treinosConcluidos * 350; // Simulando 350kcal por treino

    // 3. Função para alternar o status do dia
    const toggleDiaConcluido = (id) => {
        setDiasDaSemana(prev => 
            prev.map(dia => dia.id === id ? { ...dia, concluido: !dia.concluido } : dia)
        );
    };

    useEffect(() => {
        const carregarCliente = async () => {
            try {
                
                const response = await fetch(`http://localhost:8081/api/clientes/${idLogado}`);
                if (!response.ok) throw new Error("Cliente não encontrado");
                const dados = await response.json();
                setCliente(dados);
            } catch (error) {
                console.error("Erro ao buscar cliente:", error);
            } finally {
                setLoading(false);
            }
        };
        carregarCliente();
    }, []);

    if (loading) return <div style={{ color: 'white', padding: '20px' }}>Carregando...</div>;
    if (!cliente) return <div style={{ color: 'white', padding: '20px' }}>Erro ao carregar cliente.</div>;

    return (
        <div className="area-cliente-container">
            <Navbar nome={cliente.nome} />

            <main className="main-cliente">
                <h2>Meu treino<br />
                    <span className="MainSpan">Acompanhe seus treinos e evolução</span>
                </h2>

                <div className="DateTreino">
                    <div className="Semana">
                        <h4 style={{ fontSize: '18px' }}>Semana atual</h4>
                        <button>
                            <span className="material-symbols-outlined">calendar_today</span>
                            Ver Calendário completo
                        </button>
                    </div>

                    <div className="TreinosDaSemanaMainBox">
                        <div className="TreinoDaSemanaBox">
                            {diasDaSemana.map((dia) => (
                                <DiaDaSemana
                                    key={dia.id}
                                    dia={dia}
                                    onToggle={() => toggleDiaConcluido(dia.id)}
                                />
                            ))}
                        </div>

                        <div className="ProxTreinoMainBox">
                            <span className="SubTitle">Próximo treino</span>
                            <div className="ProxTrenoBox">
                                <div className="BoxIcons">
                                    <span className="material-symbols-outlined">fitness_center</span>
                                </div>
                                <h6>Quinta Feira <br /><span>Ombros</span></h6>
                            </div>
                            <button>Ver Treino</button>
                        </div>
                    </div>
                </div>

                <div className="TreinoMainBOX">
                    <div className="TreinosMainBox">
                        <div className="TreinoTitulo">
                            <div className="TreinoName">
                                <div className="Ajuste">
                                    <div className="BoxIcons" style={{ backgroundColor: 'rgba(0, 0, 0, 0.164)', color: 'orange', padding: '30px' }}>
                                        <span className="material-symbols-outlined">femur</span>
                                    </div>
                                </div>
                                <div className="Text1212">
                                    <h3>Treino de Perna</h3>
                                    <div className="IconsName" style={{ color: '#6B7280' }}>
                                        <span className="material-symbols-outlined">timer_5</span>
                                        60 min | {exerciciosDePerna.length} exercícios
                                    </div>
                                </div>
                            </div>
                            <button className="BtnMarkTreino">
                                <span className="material-symbols-outlined">done_all</span>
                                Marcar como concluído
                            </button>
                        </div>

                        <div className="Treinos">
                            {exerciciosDePerna.map((exercicio) => (
                                <ExercicioCard
                                    key={exercicio.id}
                                    titulo={exercicio.titulo}
                                    musculo={exercicio.musculo}
                                    imagem={exercicio.imagem}
                                    series={exercicio.series}
                                    reps={exercicio.reps}
                                    descanso={exercicio.descanso}
                                    concluido={exercicio.concluido}
                                />
                            ))}
                        </div>
                    </div>

                    <ResumoEstatisticas 
                        concluidos={treinosConcluidos}
                        total={totalTreinos}
                        tempo={`${horas}h${minutos}m`}
                        kcal={caloriasTotais}
                    />
                </div>
            </main>
        </div>
    );
}