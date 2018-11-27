<template>
  <div id="app">
    <img alt="Vue logo" id="logo" src="./assets/Bee Bank.jpg">
    <HelloWorld  msg="Welcome!"/>

     <h1>{{ msg }}</h1>
     <h1>Welcome!</h1>

  <input type="input" placeholder="Username"></input></br>
  <input type="input" placeholder="Password"></input></br>
  
  <form action="http://localhost:8080" method="POST">
      <button>Login</button></br>
  </form>
  

  <a href="/views/Home.vue">Not signed up yet? Click <strong>here</strong> to sign up!</a>

    

  </div>
</template>

<script>
import Welcome from './components/HelloWorld.vue'

export default {
  name: 'app',
  components: {
    Welcome
  }
}
</script>

<style >
#logo {
  height:60%;
  width: 60%;
  padding-bottom: 2%;
}
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: white;
  padding-top: 40%;
  padding-bottom: 40%;

 
  background-color: black;
}

h1 {
  font-weight: bolder;
  padding-bottom: 0%;
  font-size: 30px;
  color: white;
}

input {
  margin-bottom: 3%;
  border-radius: 9px;
  border-style: none;
  padding-left: 10px;
  font-size: 20px;
}

button {
  width: 100px;
  border-radius: 9px;
   background-color: yellow; 
   border-style: none;
   height: 30px;
   font-size: 15px;
   margin-bottom: 3%
}

a {
  font-size: 15px;
}
ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>


