package bussines

import Repository.ContactRepository
import entity.ContactEntity

class ContateBussines {
    private fun validate(name: String, phone: String) {
        if(name == "") {
            throw Exception("Nome é obrigatório")
        }

        if(phone == "") {
            throw Exception("Telefone é obrigatório")
        }
    }

    private fun ValideteDelete(name: String, phone: String) {
        if(name == "" || phone == "") {
            throw  Exception("É nescessario selecionar um susuário antes de remover.")
        }
    }

    fun save(name: String, phone: String) {
        validate(name, phone)
        val contact = ContactEntity(name, phone);
        ContactRepository.save(contact);
    }

    fun Delete(name: String, phone: String) {

        val contact = ContactEntity(name, phone);

        ContactRepository.delete(contact)
        ValideteDelete(name, phone)
    }

    fun getList(): List<ContactEntity> {
        return ContactRepository.getList()
    }
}