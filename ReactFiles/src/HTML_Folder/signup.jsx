import React from 'react';
import '../CSS_Stylesheets/signupStyle.css';
import logo from '../images/logo.png'; 
import { Link } from 'react-router-dom';

const Signup = () => {
  return (
    <div className="total-container">
      <div className="box-container">
        <div className="logo-header">
          <img src={logo} alt="Spotify Logo" className="logo"/>
          <h2 id="signUpHeader">Sign up for Le Spotify</h2>
        </div>
        <form action="#" method="post" className="sign-up-form">
          
          <label htmlFor="name">First Name</label>
          <input type="text" name="name" id="name" placeholder="First Name" required />
          
          <label htmlFor="surname">Last Name</label>
          <input type="text" name="surname" id="surname" placeholder="Last Name" required />

          <label htmlFor="age">Age</label>
          <input type="number" name="age" id="age" placeholder="Age" min="13" required />

          <label htmlFor="email">Email</label>
          <input type="email" name="email" id="email" placeholder="Email" required />

          <label htmlFor="username">Username</label>
          <input type="text" name="username" id="username" placeholder="Username" required />

          <label htmlFor="password">Password</label>
          <input type="password" name="password" id="password" placeholder="Password" required />

          <button type="submit" className="sign-up-button">Sign Up</button>
        </form>
        <div className="login-link">
          <p>Already have an account? <Link to="/" className="login-link-text">Log in</Link></p>
        </div>
      </div>
    </div>
  );
}

export default Signup;
