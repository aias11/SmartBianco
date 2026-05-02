import {
  useState,
  useEffect
} from "react";
import Menu from "../components/Menu";
import './Matricula.css'

function Matricula() {
  const [count, setCount] = useState(0)
  const Planos = [
    { id: 0, nome: 'Plano Basico', preco: 'R$ 99,90' },
    { id: 1, nome: 'Plano Smart', preco: 'R$ 269,90' },
    { id: 2, nome: 'Plano Premium', preco: 'R$ 999,90' },
  ];

  const [planoSelecionado, setPlanoSelecionado] = useState(null)

  const [nome, setNome] = useState('')
  const [dataNasc, setDataNasc] = useState('')
  const [cpf, setCpf] = useState('')
  const [telefone, setTelefone] = useState('')
  const [sexo, setSexo] = useState('')
  const [senha, setSenha] = useState('')

  async function handleSubmit(e) {
    if (e) e.preventDefault()

    const dadosCliente = {
      nome: nome,
      data_nasc: dataNasc,
      cpf: cpf,
      telefone: telefone,
      sexo: sexo,
      senha: senha,
      assinatura: { id: planoSelecionado || 1 },
      as_on: false,
      treino: { id: 1 },
    }

    try {
      const response = await fetch('http://localhost:8081/api/clientes', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(dadosCliente)
      })
      if (response.ok) {
        alert("Cliente cadastrado com sucesso!")
      } else {
        alert("Erro ao cadastrar cliente.")
      }
    } catch (error) {
      console.error("Erro na requisição:", error);
      alert("Servidor fora do ar ou erro de rede.");
    }
  }

  return (
    <>
      <Menu paginaAtual="matricula" />
      <main className="matriculaContainer">
        <h1>Cadastro</h1>
        <form
          className="formMatricula"
          onSubmit={handleSubmit}>
          <label htmlFor="nome">Nome Completo</label>
          <input
            className="formInput"
            type='text'
            name='nome'
            value={nome}
            onChange={(e) => {
              setNome(e.target.value)
            }}
            required />

          <label htmlFor="DTNasc">Data de nascimento</label>
          <input
            className="formInput"
            type='date'
            name='DataNasc'
            value={dataNasc}
            onChange={(e) => {
              setDataNasc(e.target.value)
            }}
            required />

          <label htmlFor="cpf">CPF</label>
          <input
            className="formInput"
            type='text'
            name='cpf'
            value={cpf}
            onChange={(e) => {
              setCpf(e.target.value)
            }}
            required />

          <label htmlFor="telefone">Telefone</label>
          <input
            className="formInput"
            type='tel'
            name='telefone'
            value={telefone}
            onChange={(e) => {
              setTelefone(e.target.value)
            }}
            required />

          <label htmlFor="sexo">Sexo</label>
          <input
            className="formInput"
            type='text'
            name='sexo'
            value={sexo}
            onChange={(e) => {
              setSexo(e.target.value)
            }}
            required />

          <label htmlFor="Senha">Senha</label>
          <input
            className="formInput"
            type='password'
            name='senha'
            value={senha}
            onChange={(e) => {
              setSenha(e.target.value)
            }}
            required />

          <div className="planosContainer">
            {Planos.map((Plano) => (
              <button
                key={Plano.id}
                className={`planoCard ${planoSelecionado === Plano.id ? 'selecionado' : ''}`}
                type='button'
                onClick={() => {
                  setPlanoSelecionado(Plano.id)
                  console.log('plano selecionado: ', planoSelecionado)
                }}>
                <h3>{Plano.nome}</h3>
                <p>{Plano.preco}</p>
              </button>
            ))}
          </div>

          <div className="botoes">
            <button className='buttonCan' type='submit'>Cancelar</button>
            <button
              className='buttonCad'
              type='submit'>Cadastrar</button>
          </div>
        </form>
      </main>
    </>
  )
}
export default Matricula