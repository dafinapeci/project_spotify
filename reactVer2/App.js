import React from 'react';
import { BrowserRouter as Router, Routes, Route, useNavigate } from "react-router-dom";
import myVideo from './assets/proje_resimler/background.mp4'; // Doğru dosya yolu  

import Signup from './screens/HTML_Folder/signup.jsx';
import Login from './screens/HTML_Folder/login.jsx';

import './screens/CSS_Stylesheets/mainPage.css';
import './App.css';
import './screens/CSS_Stylesheets/enterance.css'; 
import MainPage from './screens/HTML_Folder/mainPage'; 
// Home Bileşeni
function Home() {
  return (
    <div>
      <Startpage />

    </div>
    
  );
}

// Startpage Bileşeni
function Startpage() {
  const navigate = useNavigate();  // useNavigate kullanımı

  return (
    <>
      <div className='background-container'>
        <video autoPlay loop muted>
          <source src={myVideo} type="video/mp4" />
        </video>
      </div>

      <div className='sign-inButton'>
        {/* Sign in butonuna tıklanınca /sign-in sayfasına yönlendirilir */}
        <button onClick={() => navigate("/log-in")}>Log In</button>
      </div>

      <div className='sign-upButton'>
        {/* Sign up butonuna tıklama işlemi eklenebilir */}
        <button onClick={() => navigate("/sign-up")}>Sign Up</button>
      </div>
      <div className='ekstra'>
        {/* Sign up butonuna tıklama işlemi eklenebilir */}
        <button onClick={() => navigate("/mainPage")}>ekstra</button>
      </div>

      <div className='startLabel' >
        <label>LET'S START</label>
      </div>
    </>
  );
}

// App Bileşeni (Ana uygulama bileşeni)
function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        
        <Route path="/log-in" element={<Login />} />
        <Route path="/sign-up" element={<Signup />} />
        
        <Route path="/mainPage" element={<MainPage />} />
      </Routes>
    </Router>
  );
}

export default App;