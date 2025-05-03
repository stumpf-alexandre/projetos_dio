import { InputContainer } from './styles'

const Input = ({value}) => {
    return (
      <InputContainer>
        <input placeholder="0" disabled value={value} />
      </InputContainer>
    );
  }
  
  export default Input;