import React, { useEffect } from 'react'
import { Button, Form, FormGroup, Input, Label } from 'reactstrap'

function AddFriend() {
    useEffect(() => {
        document.title = "Add friend";
      },[]);
  return (
    <div>
        <Form>
            <FormGroup>
                <Label className="fw-normal fs-4">Name</Label>
                <Input type="text" name='fname' id="friendname" placeholder="Enter friend name"/>
            </FormGroup>
            <FormGroup>
                <Label className="fw-normal fs-4">Contact Number</Label>
                <Input type="number" name='fnumber' id="friendnumber" placeholder="Enter friend number"/>
            </FormGroup>
            <Button>Submit</Button>
        </Form>
    </div>
  )
}

export default AddFriend