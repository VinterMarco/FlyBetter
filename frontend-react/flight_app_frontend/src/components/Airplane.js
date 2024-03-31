import React from "react";


const Airplane = () => {

    const airplaneSeats = {
        "1A": false, "1B": false, "1C": false, "1D": false, "1E": false, "1F": false,
        "2A": false, "2B": false, "2C": false, "2D": false, "2E": false, "2F": false,
        "3A": false, "3B": false, "3C": false, "3D": false, "3E": false, "3F": false,
        "4A": false, "4B": false, "4C": false, "4D": false, "4E": false, "4F": false,
        "5A": false, "5B": false, "5C": false, "5D": false, "5E": false, "5F": false,
        "6A": false, "6B": false, "6C": false, "6D": false, "6E": false, "6F": false,
        "7A": false, "7B": false, "7C": false, "7D": false, "7E": false, "7F": false,
        "8A": false, "8B": false, "8C": false, "8D": false, "8E": false, "8F": false,
    };


    return (
        <div style={{height : '90vh'}}>
            <div style={{height: '100%', backgroundColor: 'transparent'}}>
                <div style={{
                    fontFamily : 'sans-serif',
                    background: 'lightgrey',
                    height: '87%',
                    width: '50%',
                    margin: 'auto',
                    justifyContent : 'center',
                    borderTopLeftRadius: '240px',
                    borderTopRightRadius: '240px',
                    display : 'flex',
                    maxHeight : '100%',
                    marginTop : "10%",
                    position : 'relative'
                }} className="wrapper">
                    <div style={{
                        backgroundColor: 'transparent',
                        width: '80%',
                        height: '80%',
                        position : "absolute",
                        bottom : '5%',
                        display : 'flex',
                        flexWrap : 'wrap',
                        gap : '5px',
                        justifyContent : "space-evenly"

                    }
                    }>
                        {Object.keys(airplaneSeats).map(seat => (
                            <div style={{
                                backgroundColor : 'white',
                                textAlign : 'center',
                                borderRadius : '5px',
                                width : 'calc(25% - 5px)',
                                height : "5%"
                            }} key={seat}>{seat}</div>
                        ))}
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Airplane;