package io.sweat.repository.exercise

import io.sweat.models.exercise.Equipment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EquipmentRepository: JpaRepository<Equipment, Int>