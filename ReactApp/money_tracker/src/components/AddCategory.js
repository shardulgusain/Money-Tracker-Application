import React, { useEffect } from 'react'
import { Button, Form, FormGroup, Input, Label } from 'reactstrap'

function AddCategory() {
    useEffect(() => {
        document.title = "Add category";
    }, []);
    return (
        <div>
            <Form>
                <FormGroup>
                    <Label className="fw-normal fs-4">Name</Label>
                    <Input type="text" name='category_name' id="category_name_id" placeholder="Enter Category name" />
                </FormGroup>
                <Button>Submit</Button>
            </Form>
        </div>
    )
}


export default AddCategory