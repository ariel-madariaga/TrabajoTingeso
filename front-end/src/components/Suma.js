import '../css/colors.css';
import React from 'react';
class Button extends React.Component {
  state = {
    show :true
  }
  render() {
    if(this.props.disabled == "true"){
      return  <div id='boton'>
      <button type="button" class="btn boton  rounded-pill  btn-lg" disabled>{this.props.text} </button>
      </div>;
    }
    else{
      return  <div id='boton'>
      <button type="button" class="btn boton rounded-pill  btn-lg" >{this.props.text} </button>
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
      <input class="form-control blanco rounded-pill" type="number"  id={this.props.id} placeholder={this.props.text} aria-label="default input example">
        </input>
      </div>
    )
  }
}

class Resultado extends React.Component {
  render() {
    return(
      <div class="col-sm">
      <input className = "resultado" class="form-control resultado rounded-pill"  id="resultado" type="text" placeholder="Resultado" disabled>
      </input>
      </div>
    )
  }
}

class Suma extends React.Component{
    render(){
        return (
            <div className="minifondo" class="ventana ">
                <h3 class= "titulo">
                  Calculadora
                </h3>
                <div class="container ">
                <div class="row ">
                    <Resultado/>
                  </div>
                  <p></p>
                  <p></p>
                  <p></p>
        
                  <div class="row ">
                    <Input text= "Primer número" id = "input1"/>
                    <Input text= "Segun número"  id = "input2"/>
                  </div>
                  <div class="row ">
                    <div class="col-sm">
                      <h4>
                        <Button text = "+" />
                      </h4>
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
            </div>
          );
    }

}

export default Suma;