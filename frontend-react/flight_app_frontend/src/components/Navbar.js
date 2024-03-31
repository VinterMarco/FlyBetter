import { Outlet, Link } from "react-router-dom";
import React from "react";

const navbarStyle = {
    display: 'flex',
    justifyContent: 'space-between',
    alignItems: 'center',
    backgroundColor: '#333',
    padding: '10px 20px',
};

const ulStyle = {
    listStyleType: 'none',
    margin: 0,
    padding: 0,
};

const liStyle = {
    display: 'inline',
    marginRight: '20px',
};

const linkStyle = {
    color: 'white',
    textDecoration: 'none',
    fontSize: '18px',
};

const Navbar = () => {
    return (
        <>
            <nav style={navbarStyle}>
                <ul style={ulStyle}>
                    <li style={liStyle}>
                        <a href="/" style={linkStyle}>Home</a>
                    </li>
                    <li style={liStyle}>
                        <a href="/bookings" style={linkStyle}>Bookings</a>
                    </li>
                    {/* Add more routes here if needed */}
                </ul>
            </nav>
            <Outlet />
        </>
    );
};

export default Navbar;