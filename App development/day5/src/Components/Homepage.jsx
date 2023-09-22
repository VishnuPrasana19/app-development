import React from 'react';
// import { Link } from 'react-router-dom';
import './Homepage.css';
import { Link } from 'react-router-dom';

export default function HomePage() {
  return (
    
    <div>
    
    <div className="Home">
    <div className="tit"> <h1>WELCOME TO CLEARLY</h1> </div>
       <Link to ="/Adminlogin" ><div className="Homeadmin">
          ADMIN LOGIN
        </div>
        </Link>
        <Link to ="/Adminlogin" >
               <div className="Homestaff">
          CUSTOMER LOGIN
        </div>
        </Link>``
      </div>
    </div>
  );
}