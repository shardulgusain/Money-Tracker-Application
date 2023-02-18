import React, { useEffect, useState } from 'react'
import { Button, Form, FormGroup, Input, Label } from 'reactstrap'
import axios from 'axios';
import base_url from '../api/SpringApi';
function AddFriend() {
    useEffect(() => {
        document.title = "Add friend";
    }, []);
    
    const [friend, setFriend]= useState({
        name:"",
        phnNo:""
    })
    const{name,contactNumber}= friend;
    //form handler
    const handleForm = (e) => {
        setFriend({...friend,[e.target.name]:e.target.value});
        
    };
     //Function that will call server to add friend
     const onSubmit=async (e)=>{
        e.preventDefault();
        console.log(friend);
        friend.phnNo=parseInt(friend.phnNo);
        console.log(friend);
        await axios.post(`${base_url}/friends`,friend);
        
     };
    return (
        <div>
            <Form onSubmit={(e)=>onSubmit(e)}>
                <FormGroup>
                    <Label className="fw-normal fs-4">Name</Label>
                    <Input type="text" name='name' id="friendname" placeholder="Enter friend name"
                    value={name} 
                    onChange={(e) =>handleForm(e)} 
                    />
                </FormGroup>
                <FormGroup>
                    <Label className="fw-normal fs-4">Contact Number</Label>
                    <Input type="number" name='phnNo' id="friendnumber" placeholder="Enter friend number"
                    value={contactNumber}
                    onChange={(e) =>handleForm(e)}  />
                </FormGroup>
                <Button type='submit'>Submit</Button>
            </Form>
        </div>
    )
}

export default AddFriend