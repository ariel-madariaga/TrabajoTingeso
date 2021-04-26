import './css/App.css';
import './css/colors.css';
import React from 'react';

class Button extends React.Component {
  state = {
    show :true
  }
  render() {
    if(this.props.disabled == "true"){
      return  <div id='boton'>
      <button type="button" class="btn btn-danger rounded-pill" disabled>{this.props.text} </button>
      </div>;
    }
    else{
      return  <div id='boton'>
      <button type="button" class="btn btn-danger rounded-pill">{this.props.text} </button>
      </div>;
    }
  }
}
class Input extends React.Component {
  state = {
    show :true
  }
  render() {
    return(
      <div class="col-sm">
      <input class="form-control rounded-pill" type="number" placeholder={this.props.text} aria-label="default input example">
        </input>
      </div>
    )
  }
}
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h3 >
          Calculin
        </h3>
        <div class="container ">
          <div class="row ">
              <div class="mb-3">
            <Input text= "Primer número"/>
            <Input text= "Segun número"/>
            </div>
          </div>
          <div class="row ">
            <div class="col-sm">
              <Button text = "+" />
            </div>
            <div class="col-sm">
              <Button text = "-" disabled = "true"/>
            </div>
            <div class="col-sm">
              <Button text = "÷" disabled = "true"/>
            </div>
            <div class="col-sm">
              <Button text = "x" disabled = "true" />
            </div>
          </div>
        </div>
        
        <img src="https://cdn140.picsart.com/260035190014212.gif?to=min&r=640" className="App-logo" alt="logo" />
      </header>
    </div>
  );
}

export default App;
