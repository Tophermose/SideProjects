const playerMove = pMove => {
	return pMove;
};

const compMove = () => {
	let number = Math.floor(Math.random() * 3) + 1;
	let cMove = '';
	console.log(number);
	if (number === 1) {
		cMove = 'Rock';
	} else if (number === 2) {
		cMove = 'Scissors';
	} else if (number === 3) {
		cMove = 'Paper';
	} else {
		console.log('That isn not a correct move');
	}
  console.log(cMove);
	return cMove;
};

const playGame = (pMove, cMove) => {
	if (pMove === 'Rock' && cMove === 'Scissors') {
		console.log('Player wins!');
	} else if (pMove === 'Rock' && cMove === 'Paper') {
		console.log('Computer wins!');
	} else if (pMove === 'Paper' && cMove === 'Scissors') {
		console.log('Computer wins!');
	} else if (pMove === 'Paper' && cMove === 'Rock') {
		console.log('Player wins!');
	} else if (pMove === 'Scissors' && cMove === 'Rock') {
		console.log('Computer wins!');
	} else if (pMove === 'Scissors' && cMove === 'Paper') {
		console.log('Player wins!');
	} else {
		console.log('It is a tie!');

	}
};

playGame(playerMove('Rock'), compMove());
