import React from 'react';
import TextInputForm from './TextInputForm';
import './App.css'

const App = () => {
    const saveText = async (text, localDateTime) => {
        try {
            const response = await fetch('/api/save-text', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body:
                    JSON.stringify({text, localDateTime}),
            });
            console.log('Text saved:', response.data);
            if (response.ok) {
                const result = await response.json();
                console.log('Text saved:', result);
            } else {
                const errorData = await response.json();
                console.log(errorData)
            }
        } catch (error) {
            console.error('An error occurred while saving text:', error);
        }
    };

    return (
        <div className="app-container">
            <div className="centered-form">
                <h2>
                    <center>Text Input Form</center>
                </h2>
                <TextInputForm onSaveText={saveText}/>
            </div>
        </div>
    );
};

export default App;
