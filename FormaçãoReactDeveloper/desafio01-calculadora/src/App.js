import Input from './components/Input';
import Button from './components/Button';
import { Container, Content, Row } from './styles';
import { useState } from 'react';

const App = () => {
  const [currentNumber, setCurrentNumber] = useState('0');

  const[firstNumber, setFirstNumber] = useState('0');

  const [operation, setOperation] = useState('');

  const handleAddNumber = (num) => {
    if(num === '.') {
      if(currentNumber.includes('.')) return;
      if(currentNumber === '0') {
        setCurrentNumber('0.');
      } else {
        setCurrentNumber(currentNumber + '.');
      }
    } else {
      if(currentNumber === '0') {
        setCurrentNumber(num);
      } else {
        setCurrentNumber(currentNumber + num);
      }
    }
  };

  const handleOnClear = () => {
    setCurrentNumber('0');
    setFirstNumber('0');
    setOperation('');
  };

  const handleSumNumbers = () => {
    if(firstNumber === '0') {
      setFirstNumber(String(currentNumber));
      setCurrentNumber('0');
      setOperation('+');
    } else {
      const sum = Number(firstNumber) + Number(currentNumber);
      setCurrentNumber(String(sum.toFixed(2)));
      setOperation('');
    }
  }

  const handleMinusNumbers = () => {
    if(firstNumber === '0') {
      setFirstNumber(String(currentNumber));
      setCurrentNumber('0');
      setOperation('-');
    } else {
      const minus = Number(firstNumber) - Number(currentNumber);
      setCurrentNumber(String(minus.toFixed(2)));
      setOperation('');
    }
  }

  const handleMultiplicationNumbers = () => {
    if(firstNumber === '0') {
      setFirstNumber(String(currentNumber));
      setCurrentNumber('0');
      setOperation('x');
    } else {
      const mult = Number(firstNumber) * Number(currentNumber);
      setCurrentNumber(String(mult.toFixed(2)));
      setOperation('');
    }
  }

  const handleDivisionNumbers = () => {
    if(firstNumber === '0') {
      setFirstNumber(String(currentNumber));
      setCurrentNumber('0');
      setOperation('/');
    } else {
      const divi = Number(firstNumber) / Number(currentNumber);
      setCurrentNumber(String(divi.toFixed(2)));
      setOperation('');
    }
  }

  const handlePercentNumbers = () => {
    if(currentNumber !== '0') {
      const percent = Number(currentNumber) / 100;
      setCurrentNumber(String(percent.toFixed(2)));
      handleEquals();
      setOperation('');
    } else {
      setCurrentNumber('0');
    }
  }

  const handleEquals = () => {
    if(firstNumber !== '0' && operation !== '' && currentNumber !== '0') {
      switch (operation) {
        case '+':
          handleSumNumbers();
          break;
        case '-':
          handleMinusNumbers();
          break;
        case 'x':
          handleMultiplicationNumbers();
          break;
        case '/':
          handleDivisionNumbers();
          break;
        case '%':
          handlePercentNumbers();
          break;
        default:
          break;
      }
    }
  }

  return (
    <Container>
      <Content>
        <Input value={currentNumber} />
        <Row>
          <Button label="C" onClick={() => setCurrentNumber('0')}/>
          <Button label="CE" onClick={handleOnClear}/>
          <Button label="%" onClick={handlePercentNumbers}/>
        </Row>
        <Row>
          <Button label="7" onClick={() => handleAddNumber('7')}/>
          <Button label="8" onClick={() => handleAddNumber('8')}/>
          <Button label="9" onClick={() => handleAddNumber('9')}/>
          <Button label="/" onClick={handleDivisionNumbers}/>
        </Row>
        <Row>
          <Button label="4" onClick={() => handleAddNumber('4')}/>
          <Button label="5" onClick={() => handleAddNumber('5')}/>
          <Button label="6" onClick={() => handleAddNumber('6')}/>
          <Button label="x" onClick={handleMultiplicationNumbers}/>
        </Row>
        <Row>
          <Button label="1" onClick={() => handleAddNumber('1')}/>
          <Button label="2" onClick={() => handleAddNumber('2')}/>
          <Button label="3" onClick={() => handleAddNumber('3')}/>
          <Button label="-" onClick={handleMinusNumbers}/>
        </Row>
        <Row>
          <Button label="0" onClick={() => handleAddNumber('0')}/>
          <Button label="," onClick={() => handleAddNumber('.')}/>
          <Button label="=" onClick={handleEquals}/>
          <Button label="+" onClick={handleSumNumbers}/>
        </Row>
      </Content>
    </Container>
  );
}

export default App;