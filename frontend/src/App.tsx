import NavBar from 'components/NavBar';
import Footer from 'components/Footer';
import React from 'react';

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary my-2">Painel de Vendas</h1>
      </div>
      <Footer />
    </>
  );
}

export default App;
