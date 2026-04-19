import { useState } from 'react'
import './Menu.css'
import Logo from '../assets/LogoSmartBianco.png'

function Menu({ paginaAtual }) {
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
          <a className={`textoMenu ${paginaAtual === 'home' ? 'ativo' : ''}`} href=''>Home</a>
          <a className={`textoMenu ${paginaAtual === 'aulas' ? 'ativo' : ''}`} href=''>Aulas</a>
          <a className={`textoMenu ${paginaAtual === 'equipe' ? 'ativo' : ''}`} href=''>Equipe</a>
          <a className={`textoMenu ${paginaAtual === 'planos' ? 'ativo' : ''}`} href=''>Planos</a>
          <button className='matricula'>Matricule-se</button>
        </div>
      </section>
    </>
  )
}

export default Menu