import React, {useState} from 'react';

const TextInputForm = ({onSaveText}) => {
    const [text, setText] = useState('');

    const handleSave = () => {
        onSaveText(text, new Date());
        setText('');
    };

    return (
        <div className="text-input-form">
            <center>
                <input
                    type="text"
                    value={text}
                    onChange={(e) => setText(e.target.value)}
                    className="input-field"
                />
            </center>
            <button className="styled-button" onClick={handleSave}>
                Save Text
            </button>
        </div>
    );
};

export default TextInputForm;
