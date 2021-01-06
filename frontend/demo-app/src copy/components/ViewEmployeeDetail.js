import React from "react";
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link,
  useParams
} from "react-router-dom";

function ViewEmployeeDetail() {
    // We can use the `useParams` hook here to access
    // the dynamic pieces of the URL.
    let { id } = useParams();

    // fetch('http://localhost:8080/api/employees/' + id);
  
    return (
      <div>
        <h3>ID: {id}</h3>
      </div>
    );
  }

  export default ViewEmployeeDetail;