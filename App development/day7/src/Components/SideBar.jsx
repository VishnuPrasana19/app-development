import React, { useState } from 'react';
import './SideBar.css'; // Import the CSS file for styling
// import Navbar from '../Pages/Navbar'
// import Footer from '../Pages/Footer'
import Home from './Home';
import Navbar from '../Pages/Navbar';
import { Link } from 'react-router-dom';
function Sidebar() {
  const [showDropdown, setShowDropdown] = useState(false);
  // Function to toggle the dropdown menu
  const toggleDropdown = () => {
    setShowDropdown(!showDropdown);
  };
  return (
    <div>
    <Navbar/>
    <div className='homeredux'>
    <Home/></div>
    <div className="sidebar">
      <div className="sidebar-header">
      DASHBOARD
      </div>
      <ul className="sidebar-menu">
        <li><button className='button'>EYEWEAR COLLECTION</button></li>
        <li className={`sidebar-dropdown ${showDropdown ? 'active' : ''}`} onClick={toggleDropdown}>
          <span><button className='button'>EDIT FRAME</button></span>
          <i className={`fas ${showDropdown ? 'fa-caret-up' : 'fa-caret-down'}`}></i>
          {/* Show caret up or down icon based on dropdown state */}
          {showDropdown && (
            <ul className="dropdown-menu">
              <li><button className='button'>ADD FRAME</button></li>
              <li><button className='button'>DELETE FRAME</button></li>
              {/* Add more dropdown items here */}
            </ul>
          )}
        </li>
        <li><button className='button'>SUNGLASS COLLECTION</button></li>
        <li><button className='button'>  VIEW CUSTOMER PAYMENT</button></li>
        <Link to="/" style={{textDecoration:'none',color:'inherit'}}><li><button className='button'>LOGOUT</button></li></Link>
      </ul>
      </div>
      </div>
      );
    }
    export default Sidebar;
    // <Footer/>
    // <Navbar/>