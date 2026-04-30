import { useState } from "react";
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


  return (
    <>
      <Menu paginaAtual="matricula" />
      <main className="matriculaContainer">
        <h1>Cadastro</h1>
        <form className="formMatricula">
          <label htmlFor="nome">Nome Completo</label>
          <input className="formInput" type='text' id='nome' name='nome' required />

          <label htmlFor="email">Email</label>
          <input className="formInput" type='email' id='email' name='email' required />

          <label htmlFor="cpf">CPF</label>
          <input className="formInput" type='text' id='cpf' name='cpf' required />

          <label htmlFor="telefone">Telefone</label>
          <input className="formInput" type='tel' id='telefone' name='telefone' required />

          <label htmlFor="endereco">Endereço</label>
          <input className="formInput" type='text' id='endereco' name='endereco' required />
          
          <div className="planosContainer">
            {Planos.map((Plano) => (
              <button
              key ={Plano.id}
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
            <button className='buttonCad' type='submit'>Cadastrar</button>
          </div>
        </form>
      </main>
    </>
  )
}
export default Matricula