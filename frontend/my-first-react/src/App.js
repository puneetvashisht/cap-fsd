import logo from './logo.svg';
import './App.css';
import Badge from './Badge2'
import Card from './components/Card'
import Dropdown from './components/Dropdown'
import ViewEmployee from './components/ViewEmployee';
import AddEmployee from './components/AddEmployee';

function App() {

  let cusines = ['Continental', 'Mexican', 'Mughali']
  let courses = ['React', 'Angular']

  return (
    <div className="App">
      <h2>Welcome to react</h2>

      <AddEmployee></AddEmployee>

      <hr/>
      <ViewEmployee></ViewEmployee>

      {/* <Dropdown title="Select Courses" courses={courses}></Dropdown>


      <Dropdown title="Select Cuisines" courses={cusines}></Dropdown> */}

      {/* <Card title="React" summary="ui library from facebook"></Card>
       <Badge caption="Inbox" count="34"></Badge>
      <Badge caption="Sent" count="3"></Badge>
      <Badge caption="Spam" count="334"></Badge> */}
    </div>
  );
}

export default App;
