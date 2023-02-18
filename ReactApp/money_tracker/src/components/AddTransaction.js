import React, { useEffect, useState } from 'react'
import { Button, Form, FormGroup, Input, Label } from 'reactstrap'
import base_url from '../api/SpringApi';
import axios from 'axios';

function AddTransaction() {
  useEffect(() => {
    document.title = "Add transactions";
  }, []);
  const [transaction, setTransaction] = useState({
    tname: "",
    tamount: "",
    Ipaid: "",
    select: ""
  })
  const { tname, tamount,select } = transaction;
  const handleForm = (e) => {
    setTransaction({ ...transaction, [e.target.name]: e.target.value });

  };
  const handleCheck = (e) => {

    console.log(e.target.checked);
    setTransaction({ ...transaction, [e.target.name]: e.target.checked });

  };
  const onSubmit = async (e) => {
    e.preventDefault();
    console.log(transaction);
    transaction.tamount = parseInt(transaction.tamount);
    console.log(transaction);
    // await axios.post(`${base_url}/friends`,friend);

  };
  // Function to call server
  useEffect(() => {
    getAllFriendsFromServer();
  }, []);
  const getAllFriendsFromServer = async () => {
    const result = await axios.get(`${base_url}/friends`)
    setFriends(result.data);
  };


  const [friends, setFriends] = useState([]);
  return (
    <div>
      <Form onSubmit={(e) => onSubmit(e)}>
        <FormGroup>
          <Label for="tname">Transaction Category</Label>
          <Input type="text" name="tname" id="tname_id" placeholder="Transaction name"
            value={tname}
            onChange={(e) => handleForm(e)} />
        </FormGroup>
        <FormGroup>
          <Label for="tamount">Amount</Label>
          <Input type="number" name="tamount" id="tamount_id" placeholder="Transaction amount"
            value={tamount}
            onChange={(e) => handleForm(e)} />
        </FormGroup>
        <FormGroup check>
          <Label check>
            <Input type="checkbox" name="ipaid" id="checkBox"
              // value={Ipaid} 
              onChange={(e) => handleCheck(e)} />
            Check me if you paid
          </Label>
        </FormGroup>
        <FormGroup>
        <Label for="exampleSelect">Select</Label>
          <Input type="select" name="select" value={option.value} id="exampleSelect ">
          {
        friends.map((friend,index)=>(
            <option value={friend.name}>{friend.name}</option>
        ))
}
          </Input>
            
      </FormGroup>
      <Button type='submit'>Submit</Button>
    </Form>
    </div >
  );
};

export default AddTransaction;
