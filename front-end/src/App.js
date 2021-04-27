import './css/App.css';
import './css/colors.css';
import React from 'react';

import Suma from './components/Suma.js'

function App() {
  return (
    <div className="formato">
      <header className="fondo">
        <div class="fondo-imagen" style={{ backgroundImage: 'url(https://i.ibb.co/2K43mXT/3955269-2x.png)' }}>
        <Suma/>
        </div>
      </header>
    </div>
  );
}
export default App;