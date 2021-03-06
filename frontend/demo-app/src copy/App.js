import logo from './logo.svg';
import './App.css';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";
import ViewEmployee from './components/ViewEmployee';
import AddEmployee from './components/AddEmployee';
import ViewEmployeeDetail from './components/ViewEmployeeDetail';

function App() {
  return (
    <Router>
      <div>
      <nav class="nav">
        <Link class="nav-link active" to="/">Home</Link>
        <Link class="nav-link active" to="/view">View Employees</Link>
        <Link class="nav-link active" to="/add">Add Employees</Link>
       
    </nav>
    <hr/>


       

        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
        <Switch>
          <Route exact path="/view">
            <ViewEmployee></ViewEmployee>
          </Route>
          <Route path="/viewdetail/:id">
            <ViewEmployeeDetail></ViewEmployeeDetail>
          </Route>
          <Route path="/add">
            <AddEmployee></AddEmployee>
          </Route>
          <Route exact path="/">
            <Home />
          </Route>
          <Route path="*">
            <NoMatch />
          </Route>
        </Switch>
      </div>
    </Router>
  );
}

function Home() {
  return <h2>Home</h2>;
}
function NoMatch() {


  return (
    <div>
      <h3>
        No match for this url found
      </h3>
    </div>
  );
}

export default App;
