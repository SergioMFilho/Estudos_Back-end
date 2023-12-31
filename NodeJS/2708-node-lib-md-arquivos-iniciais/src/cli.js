import chalk from "chalk";
import pegaArquivo from "./index.js";
import fs from 'fs'

const caminho = process.argv;

function imprimeLista(resultado, identificador = '') {
    console.log(
        chalk.yellow('Lista de links'), 
        chalk.black.bgGreen(identificador),
        resultado)
}

async function processaTexto(argumentos) {
    const caminho = argumentos[2];

    try {
        fs.lstatSync(caminho)
    }catch(erro) {
        if(erro.code === 'ENOENT') {
            console.log('arquivo ou diretório não existe');
            return
        }
    }


    if(fs.lstatSync(caminho).isFile()) {
        const resultado = await pegaArquivo(argumentos[2]);
        imprimeLista(resultado)
    } else if (fs.lstatSync(caminho).isDirectory()) {
        const arquivos = await fs.promises.readdir(caminho)
        arquivos.forEach( async (nomeDoArquivo) => {
            const lista = await pegaArquivo(`${caminho}${nomeDoArquivo}`)
            imprimeLista(lista, nomeDoArquivo)
        })
        console.log(chalk.blue(arquivos))
    }
}

processaTexto(caminho)  