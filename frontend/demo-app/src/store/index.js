import { combineReducers } from "redux"

import employeereducer from "./reducer"
import userreducer from "./userreducer"

export default combineReducers({
    employee: employeereducer,
    userreducer
})
