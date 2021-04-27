import '../css/colors.css';
import React, {Component } from 'react';
import axios from "axios";

class Suma extends Component {
  constructor(){
    super();
    this.state = {
      baseUrl : "http://localhost:1818",
      num1: "",
      num2: "",
      result: ""
    };

  }

  setNum1 = e =>{
    const {value}=e.target
    this.setState({
      num1 : value
    })
  }
  setNum2 = e=>{
    const {value}=e.target
    this.setState({
      num2:value
    });
  }
  handleSubmit = e => {
    e.preventDefault();
      axios.post(this.state.baseUrl + "/sum", {
          operandA : this.state.num1 ,        
          operandB : this.state.num2
      })
      .then( response => {
        this.setState({
            result: response.data.result
        });
        console.log("RESPONDIDO")})
      .catch(err=>console.log(err));
  };
  render(){
    return (
      <div className="minifondo" class="ventana " style={{ backgroundImage: 'url(https://i.ibb.co/XCPM1jr/Trazado-1.png)' }}>
    <h3 class= "titulo">
        Calculadora
      </h3>
      <p></p>
      <div class="container ">
        <form method="post"onSubmit={ this.handleSubmit }>
          <div class="row ">
            <Input text= "Primer número" id = "input1" onInputChange={this.setNum1}></Input>
          </div>
          <div class="row ">
            <Input text= "Segundo número"  id = "input2" onInputChange={this.setNum2}></Input>
          </div>
          <div class="row ">
            <div class="boton1">
              <h4>
                <Button text = "+" />
              </h4>
            </div>
            <div class="boton2">
              <Button text = "-" disabled = "true"/>
            </div>
          </div>
        </form>

        
      <div class="row ">
      <div class="col-sm">
      <input className = "resultado" class="form-control resultado"  id="resultado" type="text" placeholder="Resultado" defaultValue={this.state.result} disabled>
      </input>
      </div>
        </div>
      </div>
  </div> )}
  }

  class Button extends React.Component {
    state = {
      show :true
    }
    render() {
      if(this.props.disabled === "true"){
        return  <div id='boton'>
        <button type="button" class="btn boton btn-lg" disabled>{this.props.text} </button>
        </div>;
      }
      else{
        return  <div id='boton'>
        <button type="submit" class="btn boton btn-lg" >{this.props.text} </button>
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
        <input class="form-control" type="number"  id={this.props.id} placeholder={this.props.text} aria-label="default input example" onChange={this.props.onInputChange}>
          </input>
        </div>
      )

      

    }
  }
  /*
  class Resultado extends React.Component {
  render() {
    return(
      <div class="col-sm">
      <input className = "resultado" class="form-control resultado"  id="resultado" type="text" placeholder="Resultado" defaultValue={this.state.resultado} disabled>
      </input>
      </div>
    )
  }
}*/
  

export default Suma;