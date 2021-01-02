import logo from './logo.svg';
import './App.css';
import Badge from './Badge2'
import Card from './components/Card'

function App() {
  return (
    <div className="App">
      <h2>Welcome to react</h2>
      <Card title="React" summary="ui library from facebook"></Card>
       <Badge caption="Inbox" count="34"></Badge>
      <Badge caption="Sent" count="3"></Badge>
      <Badge caption="Spam" count="334"></Badge>
    </div>
  );
}

export default App;
