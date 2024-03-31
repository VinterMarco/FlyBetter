import { Outlet, Link } from "react-router-dom";
import React from "react";


const Navbar = () => {
    return (
        <>
            <nav>
                <ul>
                    <li>
                        <Link to="/">Home</Link>
                    </li>
                    <li>
                        <Link to="/bookings">Bookings</Link>
                    </li>
                    {/*  more routes if needed   */}
                </ul>
            </nav>

            <Outlet />
        </>
    )
};

export default Navbar;