# vue-frontend

## Project setup
```
npm install
```

### Compiles and hot-reloads for development
```
npm run serve
```

### Compiles and minifies for production
```
npm run build
```

### Lints and fixes files
```
npm run lint
```

### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).


###  Create Vue Component 
Let's understand the above code step by step:
One of the first things you would need to understand about Vue is the concept of the component. Vue component is consists of template, script, and style.

```
template is nothing but the HTML template with Vue directives
script is javascript code to write for the Vue module
style is CSS for the Vue module
```

###created()
created() - Vue defines a component lifecycle. created will be called as soon as the component is mounted. We are calling getEmployees() as soon as a component is mounted:
```
created() {
        this.getEmployees();
}
```

###methods
methods: { getEmployees() {}} - Any method in a Vue component should be under methods. 
```
methods: {
        getEmployees(){
            EmployeeService.getEmployees().then((response) => {
                this.employees = response.data;   
            });
        }
},

```

###EmployeeService.getEmployees().then
This would make the call to the REST API. You can define how to process the response in the then method:
```
 EmployeeService.getEmployees().then((response) => {
                this.employees = response.data;   
});
```
