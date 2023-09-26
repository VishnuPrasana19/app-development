import React from 'react'
import  "../Styles/Homepage.css"
import MidOne from '../Components/Navbar/MidOne'
export const Homepage = () => {
  return (
        <div>
        <div className="banner-container">
                       <div className="text-center">
                            <h1 className=" clear">Welcome to Clearly</h1>
                           <h4 className="quote">See the world through a different lens.</h4>
                       </div>
                       </div>
                       <div className='swathi'><MidOne/></div>
                   </div>   
  )
}
