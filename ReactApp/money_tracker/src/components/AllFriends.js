import React from 'react'
import {useState,useEffect  } from "react";
import { Alert, Button, Card, CardBody, CardSubtitle, CardText, Container } from 'reactstrap';
import base_url from '../api/SpringApi';
import axios from 'axios'; 
import Friend from './Friend';
function AllFriends() {
  useEffect(() => {
    document.title = "All friends";
  },[]);
  //Function to call server
  useEffect(() => {
    getAllFriendsFromServer();
  },[]);
  const getAllFriendsFromServer=async()=>
  {
     const result = await axios.get(`${base_url}/friends`)
     setFriends(result.data);
  };
 
  const[friends, setFriends] = useState([]);
  return (
    <div>
      <h2>My Friend List</h2>
      {
        friends.map((friend,index)=>(
          <Card>
            <CardBody className='text-center' key={index}>{index+1}
              <CardSubtitle className='text-center'>{friend.name}</CardSubtitle>
              <CardText className='text-center'>{friend.phnNo}</CardText>
              <Container className='text-center'>
                <Button >Update</Button>{" "}
                <Button>Delete</Button>
              </Container>
            </CardBody>
          </Card>
        ))
      }
      </div>
  )
}

export default AllFriends;