import React from 'react';
import Login from './HTML_Folder/login.jsx';
import Signup from './HTML_Folder/signup.jsx';
import './CSS_Stylesheets/loginStyle.css';
import logo from './images/logo.png';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
function App() {
   return (
    <Router>
    <Routes>
    <Route path="/" element={<Login />} />
      <Route path="/signup" element={<Signup />} />
    </Routes>
  </Router>
    

   );
}

export default App;
