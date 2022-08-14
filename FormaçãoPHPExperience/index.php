<?php
	//primeiro código em php
	echo nl2br("Ola mundo!\n");//comando para quebrar uma linha no php
	
	//$ declara uma variavel
	$cursos = 30;
	$paginas = "php";
	echo nl2br("Temos $cursos cursos $paginas disponíveis\n");

	//criando uma regra de negócio
	if ($paginas === "php"){
		$cursos = 15;
		echo nl2br("Temos $cursos cursos disponiveis\n");
	}
?>