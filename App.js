import React from 'react';

import {BrowserRouter as Router, Route, Switch}from 'react-router-dom'
import ListDepartmentComponent from './components/ListDepartmentComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import CreateDepartmentComponent from './components/CreateDepartmentComponent';
//import UpdateDepartmentComponent from './components/UpdateDepartmentComponent';
import ViewDepartmentComponent from './components/ViewDepartmentComponent';
//import LoginForm from './components/LoginForm';

function App() {
  return (
    <div>
      <Router>
        {/*<div className="container"></div>*/}
          <HeaderComponent />
            <div className="container">
               <Switch> 
                  <Route path = "/" exact component = {ListDepartmentComponent}></Route>
                  <Route path = "/department" component = {ListDepartmentComponent}></Route>
                  <Route path = "/add-department/:id" component = {CreateDepartmentComponent}></Route>
                  <Route path = "/view-department/:id" component = {ViewDepartmentComponent}></Route>
                  {/*<Route path = "/update-department/:departmentId" component ={UpdateDepartmentComponent}></Route>*/}
                 {/*<Route path = "/login-form" component = {LoginForm}></Route>*/}
                  
                  <ListDepartmentComponent />
                  <CreateDepartmentComponent />
                  <ViewDepartmentComponent />
                </Switch>
           </div>
          <FooterComponent />
      </Router>
     </div>
  );
}
export default App;