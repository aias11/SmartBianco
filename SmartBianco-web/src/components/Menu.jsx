import { useState } from 'react'
import { Link, Navigate, useNavigate } from 'react-router-dom'
import './Menu.css'
import Logo from '../assets/LogoSmartBianco.png'

function Menu({ paginaAtual }) {
  const navigate = useNavigate();
  const [count, setCount] = useState(0)

  return (
    <>
      <section className='menuContainer'>

        <img
          src={Logo}
          alt='Logo da empresa'
          className="logo"
        >
        </img>

        <div className='paginasMenu'>
          <Link className={`textoMenu ${paginaAtual === 'home' ? 'ativo' : ''}`} to='/'>
            Home
          </Link>
          <Link className={`textoMenu ${paginaAtual === 'aulas' ? 'ativo' : ''}`} to='/aulas'>
            Aulas
          </Link>
          <Link className={`textoMenu ${paginaAtual === 'equipe' ? 'ativo' : ''}`} to='/equipe'>
            Equipe
          </Link>
          <Link className={`textoMenu ${paginaAtual === 'planos' ? 'ativo' : ''}`} to='/planos'>
            Planos
          </Link>
          <button
            className='matricula'
            onClick={() => {
              navigate('/matricula')
              console.log("Botão clicado")
            }}>
            Matricule-se
          </button>

        </div>
      </section>
    </>
  )
}

export default Menu