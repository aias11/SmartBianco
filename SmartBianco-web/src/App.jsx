import { Routes, Route } from 'react-router-dom';
import Home from './pages/Home'; // Aqui está todo o código que era do seu App antigo
import Matricula from './pages/Matricula'; 

function App() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/matricula" element={<Matricula />} />
    </Routes>
  );
}

export default App;