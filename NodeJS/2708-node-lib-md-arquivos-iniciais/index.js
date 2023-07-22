import fs from 'fs'
import chalk from 'chalk'

function extraiLinks(texto) {
  const regex = /\[([^[\]]*?)\]\((https?:\/\/[^\s?#.].[^\s]*)\)/gm;
  const capturas = [...texto.matchAll(regex)];
  const resultados = capturas.map((captura) => ({ [captura[1]]: [captura[2]]
  }))
  return resultados;
}

function trataErro(erro) {
  console.log(erro)
  throw new Error(chalk.red(erro.code, 'não há arquivo no diretório'));
}

async function pegaArquivo(caminhoDoArquivo) {
  try {
    const encoding = 'utf-8';
    const texto = await fs.promises.readFile(caminhoDoArquivo, encoding)
    extraiLinks(texto)
  } catch(erro) {
    trataErro(erro)
  } finally {
    console.log(chalk.yellow('operação concluída'));
  }
}

pegaArquivo('./arquivos/texto.md')


//  \[[^[\]]*?\]
//  \(https?:\/\/[^\s?#.].[^\s]*\)
//   \[([^[\]]*?)\]\((https?:\/\/[^\s?#.].[^\s]*)\)
   
  //  function exibeResposta(textoResult) {
  //   console.log(textoResult);
  //  }
   
  //  promessa(false)
  //   .then((texto) => exibeResposta(texto))
   // sucesso na promessa
