import { useNavigate } from 'react-router-dom';
import { useState } from 'react'

import './home.css'
import Menu from '../components/menu';
import background from '../assets/imagemdefundo.png'
import { Button } from 'bootstrap'

import musculacao from '../assets/musculacao.jpg'
import zumba from '../assets/zumba.png'
import pilates from '../assets/pilates.png'
import natacao from '../assets/natacao.jpg'


import { BiDumbbell } from "react-icons/bi";
import { Ri24HoursLine, RiWhatsappFill, RiFacebookCircleFill, RiInstagramFill  } from "react-icons/ri";
import { MdDirectionsCar } from "react-icons/md";
import { CiDumbbell } from "react-icons/ci";

function Home() {
  const navigate = useNavigate();

  return (
<>
      <Menu paginaAtual="home" />
      <main className=''>
        <section className='bannerPrincipal'>
          <img
            src={background}
            alt='imagem de fundo'
            className='background'
          />
          <div className='conteudoBanner'>
            <div className='fundoTexto'>
              <h1>LIBERTE SEU POTENCIAL</h1>
            </div>
            <div className='fundoTexto'>
              <h3>SMARTBIANCO: ENERGIA, MOVIMENTO & RESULTADO</h3>
            </div>
            <div className='botoes'>
              <button className='estilobotoes'>Matricule-se</button>
              <button className='estilobotoesAulas'>Veja as aulas</button>
            </div>
          </div>
        </section>
        <section className='diferenciais'>
          <h2>Porque escolher a SmartBianco?</h2>
          <div className='containerDif'>
            <div className='cardDif'>
              <Ri24HoursLine className='icon' />
              <p>Aberto 24 horas</p>
            </div>
            <div className='cardDif'>
              <BiDumbbell className='icon' />
              <p>Equipamentos de ultima geração</p>
            </div>
            <div className='cardDif'>
              <MdDirectionsCar className='icon' />
              <p>Estacionamento gratuito</p>
            </div>
            <div className='cardDif'>
              <CiDumbbell className='icon' />
              <p>Personal trainers com atendimento personalizado</p>
            </div>
          </div>
        </section>
        <section className='modalidades'>
          <h2>Nossas Modalidades</h2>
          <div className='containerModa'>
            <div className='cardModa'>
              <img
                src={musculacao}
                alt='Imagem de musculação'
                className='imgCard'
              />
              <h1>Musculação</h1>
              <div className='textoCard'>
                <p>Força e definição muscular em cada treino.</p>
                <button className='saibamais'>Saiba Mais</button>
              </div>
            </div>
            <div className='cardModa'>
              <img
                src={zumba}
                alt='Imagem de zumba'
                className='imgCard'
              />
              <h1>Zumba</h1>
              <div className='textoCard'>
                <p>Ritmo, energia e queima de calorias.</p>
                <button className='saibamais'>Saiba Mais</button>
              </div>
            </div>
            <div className='cardModa'>
              <img
                src={pilates}
                alt='Imagem de pilates'
                className='imgCard'
              />
              <h1>Pilates</h1>
              <div className='textoCard'>
                <p>Equilíbrio, postura e fortalecimento do corpo.</p>
                <button className='saibamais'>Saiba Mais</button>
              </div>
            </div>
            <div className='cardModa'>
              <img
                src={natacao}
                alt='Imagem natação'
                className='imgCard'
              />
              <h1>Natação</h1>
              <div className='textoCard'>
                <p>Resistência e saúde em baixo da água.</p>
                <button className='saibamais'>Saiba Mais</button>
              </div>
            </div>
          </div>
        </section>
        <section className='planos'>
          <h2>Nossos Planos</h2>
          <div className='containerPlanos'>

            <div className='cardPlanos'>
              <div className='headerCard'>
                <h1>Plano Básico</h1>
              </div>
              <div className='corpoCard'>
                <h2>R$ 99,90/mês</h2>
                <ul>
                  <li>Musculação</li>
                  <li>Aulas de Zumba, Pilates</li>
                  <li>Sem convidados</li>
                </ul>
                <button className='btnMatricula basico'>Matricule-se Agora</button>
              </div>
            </div>

            <div className='cardPlanos'>
              <div className='headerCard'>
                <h1>Plano Smart</h1>
              </div>
              <div className='corpoCard'>
                <h2>R$ 269,90/mês</h2>
                <ul>
                  <li>Musculação</li>
                  <li>Aulas de Zumba, Pilates, Natação</li>
                  <li>3 convidados no mês</li>
                </ul>
                <button className='btnMatricula basico'>Matricule-se Agora</button>
              </div>
            </div>

            <div className='cardPlanos premium'>
              <div className='headerCard orange'>
                <h1>Plano Premium</h1>
              </div>
              <div className='corpoCard'>
                <h2>R$ 999,90/mês</h2>
                <p className='destaque'>Acesso a todas as aulas + Convide um amigo!</p>
                <ul>
                  <li>Musculação</li>
                  <li>Aulas de Zumba, Pilates, Natação</li>
                  <li>10 convidados no mês</li>
                  <li>Avaliação alimentar e física</li>
                </ul>
                <button className='btnMatricula laranja'>Matricule-se Agora</button>
              </div>
            </div>

          </div>
        </section>
        <footer className="footer">
          <div className="containerFooter">

            <div className="colunaFooter">
              <div className="itemContato">
                <MdDirectionsCar className="iconFooter" />
                <p>Rua Exemplo, 123, Centro, Guarulhos</p>
              </div>
              <div className="itemContato">
                <Ri24HoursLine className="iconFooter" />
                <div>
                  <p>24 horas por dia</p>                  
                </div>
              </div>
              <div className="itemContato">
                <p className="telefoneFooter">📞 (11) 5536-5950</p>
              </div>
            </div>

            <div className="colunaFooter">
              <h3>Links</h3>
              <ul>
                <li><a href="#">Política de Privacidade</a></li>
                <li><a href="#">Termos de Uso</a></li>
                <li><a href="#">Nossas Aulas</a></li>
                <li><a href="#">Contato</a></li>
              </ul>
            </div>


            <div className="colunaFooter redesSociais">
              <div className="iconesRedes">
                <a href="#"><i><RiFacebookCircleFill /> </i></a>
                <a href="#"><i><RiInstagramFill /> </i></a>
                <a href="#"><i><RiWhatsappFill /> </i></a>
              </div>
              <a href="#" className="linkDireto">Direto com o consultor</a>
            </div>

          </div>
          <div className="copyright">
            <p>&copy; 2026 SmartBianco - Todos os direitos reservados.</p>
          </div>
        </footer>
      </main>
    </>
  );
}
export default Home;