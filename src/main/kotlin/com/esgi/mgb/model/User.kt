package com.esgi.mgb.model

import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.Email


@Document
data class User(@Id val id: String,
				var pseudo: String,
				var name: String,
				@Email(regexp = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})")
				var email: String,
				private var password: String,
				val birthDate: LocalDate,
				var listBar: MutableList<Bar>? = null)
