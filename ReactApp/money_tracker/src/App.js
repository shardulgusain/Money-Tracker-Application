import { ToastContainer } from 'react-toastify';
import { Col, Container, Row } from 'reactstrap';
import './App.css';
import Header from './components/Header';
import Menus from './components/Menus';
import {
  BrowserRouter as Router,
  Route,
  Link,
  Routes
} from "react-router-dom";
import AddFriend from './components/AddFriend';
import AllFriends from './components/AllFriends';
import Friend from './components/Friend';


function App() {
  return (
    <div>
      <Router>
      <ToastContainer/>
      <Container>
        <Header/>
        <Row>
          <Col md={4}>
            <Menus/>
          </Col>
          <Col md={8}>
            <Routes>
            {/* <Route path='/' component={Home} exact/> */}
            <Route path="add-friend" element={<AddFriend/>} />
            <Route path="view-friends" element={<AllFriends/>} />
            {/* <Route path='add-transaction' component={AddFriend} exact/> */}
            {/* <Route path='view-friends' component={AddFriend} exact/> */}
            {/* <Route path='view-transactions' component={AddFriend} exact/> */}
            {/* <Route path='about' component={AddFriend} exact/> */}
            {/* <Route path='contact' component={AddFriend} exact/> */}
            </Routes>
          </Col>
        </Row>
      </Container>
      </Router>
    </div>
  );
}

export default App;
