import React from 'react';
import '../CSS_Stylesheets/loginStyle.css';
import logo from '../images/logo.png'; 
import { Link } from 'react-router-dom';

const Login = () => {
  return (
    <div className="total-container">
      <div className="box-container">
        <div className="logo-header">
          <img src={logo} alt="Spotify Logo" className="logo" />
          <h2 id="loginHeader">Log in to Le Spotify</h2>
        </div>
        <div>
          <form action="#" method="post" className="login-form">
            <label>Email or username</label>
            <input type="text" name="username" placeholder="Email or username" required />
            <label>Password</label>
            <input type="password" name="password" placeholder="Password" required />
            <button type="submit" className="login-button">Log In</button>
          </form>
          <a href="#" className="forgot-password">Forgot your password?</a>
          <div className="create-account-section">
            <p>Don't have an account? <Link to="/signup" className="create-account">Sign up for Le Spotify</Link></p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Login;
