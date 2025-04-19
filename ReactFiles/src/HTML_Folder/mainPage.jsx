import logo from '../images/logo.png';
import React, { useState } from 'react';
import '../CSS_Stylesheets/mainPageStyle.css';


export default function MainPage() {
  const [activeTab, setActiveTab] = useState('downloads');
  const [progress, setProgress] = useState(0);

  const [downloadBoxes, setDownloadBoxes] = useState([]);
  const [playlistBoxes, setPlaylistBoxes] = useState([]);
  const [linkBoxes, setLinkBoxes] = useState([]);

  const handleAddBox = () => {
    if (activeTab === 'downloads') {
      setDownloadBoxes([...downloadBoxes, {}]);
    } else if (activeTab === 'playlist') {
      setPlaylistBoxes([...playlistBoxes, {}]);
    } else if (activeTab === 'links') {
      setLinkBoxes([...linkBoxes, { text: '' }]);
    }
  };

  const handlePlayPause = () => {
    console.log("Play/Pause");
  };

  const handlePrevious = () => {
    console.log("Previous Song");
  };

  const handleNext = () => {
    console.log("Next Song");
  };

  const handleProgressChange = (event) => {
    setProgress(event.target.value);
  };

  const handleTextChange = (index, event) => {
  
    const updatedLinkBoxes = [...linkBoxes];
    updatedLinkBoxes[index].text = event.target.value;
    setLinkBoxes(updatedLinkBoxes);
  };

  return (
    <>
    <div className="main-page">
       <div className="strip">
        <img src={logo} alt="black background" />
          <h1>Le-Spotify</h1>
            <div className="buttonD">
             <button onClick={() => setActiveTab('downloads')}>Downloads</button>
            </div>
             <div className="buttonL">
              <button onClick={() => setActiveTab('links')}>Links</button>
            </div>
              <div className="buttonP">
             <button onClick={() => setActiveTab('playlist')}>Playlist</button>
          </div>
      </div>

      <div className="containerAll">
        {/* TAB Buttons */}
        <div className="upperbox">
          <button
            className={`leftbtn ${activeTab === 'downloads' ? 'active' : ''}`}
            onClick={() => setActiveTab('downloads')}
          >
            Downloads
          </button>
          <button
            className={`rightbtn ${activeTab === 'links' ? 'active' : ''}`}
            onClick={() => setActiveTab('links')}
          >
            Links
          </button>
          <button
            className={`rightbtn ${activeTab === 'playlist' ? 'active' : ''}`}
            onClick={() => setActiveTab('playlist')}
          >
            Playlist
          </button>
        </div>

        {/* Contents */}
        {activeTab === 'downloads' && (
          <>
            {downloadBoxes.map((_, index) => (
              <div key={index} className="innerbox">
                <p style={{ marginLeft: '8px' }}>{index + 1})</p>
              </div>
            ))}
            <div className="plusbox">
              <button onClick={handleAddBox}>+</button>
            </div>
          </>
        )}

        {activeTab === 'links' && (
          <>
            {linkBoxes.map((box, index) => (
              <div key={index} className="innerbox">
                <p style={{ marginLeft: '8px' }}>{index + 1})</p>
                <textarea
                  value={box.text}
                  onChange={(event) => handleTextChange(index, event)}
                  placeholder="Enter a link"
                  rows="4"
                  cols="50"
                  style={{
                    resize: 'none', // Kullanıcı boyutlandırmasın
                    marginTop: '3px',
                    padding: '10px',
                    bottom:'10px',
                    width: '95%',
                    alignItems: 'center',
                    display: 'flex',
                    justifyContent: 'center',
                    backgroundColor: '#f4f4f4',
                    border: '1px solid #ccc',
                    borderRadius: '5px',
                  }}
                ></textarea>
              </div>
            ))}
            <div className="plusbox">
              <button onClick={handleAddBox}>+</button>
            </div>
          </>
        )}

        {activeTab === 'playlist' && (
          <>
            <div className="playlistWrapper">
              {playlistBoxes.map((_, index) => (
                <div key={index} className="innerbox2">
                  <p>{index + 1}</p>
                </div>
              ))}
              <div className="plusbox">
                <button onClick={handleAddBox}>+</button>
              </div>
            </div>
          </>
        )}
      </div>

      <div className="bottom">
        <input
          type="range"
          name="range"
          id="myProgressBar"
          min="0"
          value={progress}
          max="100"
          onChange={handleProgressChange}
        />
        <div className="icons">
          <button onClick={handlePrevious}>
           
          </button>
          <button onClick={handlePlayPause}>
            
          </button>
          <button onClick={handleNext}>
            
          </button>
        </div>
        <div className="songInfo">{/* Şarkı adı buraya */}</div>
      </div>
      </div>
    </>
  );
}