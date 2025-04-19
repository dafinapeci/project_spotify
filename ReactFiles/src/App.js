import React from 'react';
import { BrowserRouter as Router, Routes, Route, useNavigate } from "react-router-dom";

import Login from './HTML_Folder/login.jsx';
import Signup from './HTML_Folder/signup.jsx';
import MainPage from './HTML_Folder/mainPage.jsx';
import './CSS_Stylesheets/mainPageStyle.css';
import './CSS_Stylesheets/entrance.css';


import logo from './images/logo.png';
import mySong from './songs/1.mp3';


function Home() {
  return (
    <div>
      <Startpage />

    </div>
    
  );
}

function Startpage() {
  const navigate = useNavigate();  // useNavigate 

  return (
    <>
      <div className='background-container'>
        <video autoPlay loop muted>
          <source src={mySong} type="video/mp4" />
        </video>
      </div>

      <div className='sign-inButton'>
        {/* When you click on the Sign in button, it redirects you to the /sign-in page. */}
        <button onClick={() => navigate("/login")}>Log In</button>
      </div>

      <div className='sign-upButton'>
        {/* Click action can be added to the sign up button */}
        <button onClick={() => navigate("/signup")}>Sign Up</button>
      </div>
      <div className='ekstra'>
        {/* Click action can be added to the sign up button */}
        <button onClick={() => navigate("/mainPage")}>ekstra</button>
      </div>

      <div className='startLabel' >
        <label>Let's Start</label>
      </div>
    </>
  );
}


function App() {
   return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        
        <Route path="/login" element={<Login />} />
        <Route path="/signup" element={<Signup />} />
        <Route path="/mainPage" element={<MainPage />} />
      </Routes>
  </Router>
    

   );
}

export default App;
