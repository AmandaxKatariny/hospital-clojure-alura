(ns hospital.aula2
  (:use [clojure pprint])
  (:require [hospital.model :as h.model]
            [hospital.logic :as h.logic]))

; Simbolo que qualquer thread que acessar esse namespace terá acesso a ele com o valor padrão "Amanda"
(def nome "Amanda")

;redefinir o simbolo (refez o binding)
(def nome 12675)

(let [nome "Amanda"]
  ;coisa 1
  ;coisa 2
  (println nome)
  ;não está refazendo o binding do simbolo local
  ; Criando um novo simbolo local a este bloco e ESCONDENDO o anterior
  ; SHADOWING
  (let [nome "Daniela"]
    ;coisa 3
    ;coisa 4
    (println nome))
  (println nome))

(defn testa-atamao []
  (let [hospital-silveira (atom {:espera h.model/fila-vazia})]
    (println hospital-silveira)
    (pprint hospital-silveira)
    (pprint (deref hospital-silveira))
    (pprint @hospital-silveira)

    ; Não é assim que altera o conteudo dentro de um atomo
    (pprint (assoc @hospital-silveira :laboratorio1 h.model/fila-vazia))
    (pprint @hospital-silveira)

    ; essa é umas das maneiras de alterar o conteudo dentro de um atomo
    (swap! hospital-silveira assoc :laboratorio1 h.model/fila-vazia)
    (pprint @hospital-silveira)

    (swap! hospital-silveira assoc :laboratorio2 h.model/fila-vazia)
    (pprint @hospital-silveira)

    ;update tradicional imutavel, com dereferencia, que não trará efeito
    (update @hospital-silveira :laboratorio1 conj "111")

    ; indo pro swap
    (swap! hospital-silveira update :laboratorio1 conj "555")
    (pprint hospital-silveira)


    ))

(testa-atamao)