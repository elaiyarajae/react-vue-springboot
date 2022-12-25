<template>
  <EmployeesComponent />
</template>

<script>
import EmployeesComponent from "@/components/EmployeesComponent";

export default {
  name: 'App',
  components: {
    EmployeesComponent
  }
}
</script>

<style>
#app {
  font-family: 'calibri', sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
