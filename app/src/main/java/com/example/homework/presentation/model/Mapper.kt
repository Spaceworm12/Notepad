package com.example.homework.presentation.model

import com.example.homework.data.models.model.db.entity.ExampleEntity
import com.example.homework.data.models.model.noteModel.NoteModel
import com.example.homework.presentation.model.NoteModel as ExampleNoteModelPresentation

object Mapper {

    private fun transformToPresentation(noteModel: NoteModel): ExampleNoteModelPresentation {
        return ExampleNoteModelPresentation(
            id = noteModel.id,
            name = noteModel.name,
            description = noteModel.description
        )
    }

    fun transformToPresentation(task: List<NoteModel>): List<ExampleNoteModelPresentation> {
        return task.map { transformToPresentation(it) }
    }

    fun transformToData(model: ExampleNoteModelPresentation): ExampleEntity {
        return ExampleEntity(
            id = model.id,
            name = model.name,
            description = model.description
        )
    }

}
