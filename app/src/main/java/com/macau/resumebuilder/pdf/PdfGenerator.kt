package com.macau.resumebuilder.pdf

import android.content.Context
import com.itextpdf.kernel.pdf.PdfDocument
import com.itextpdf.kernel.pdf.PdfWriter
import com.itextpdf.layout.Document
import com.itextpdf.layout.element.Paragraph
import com.itextpdf.layout.element.Text
import com.itextpdf.layout.properties.TextAlignment
import com.macau.resumebuilder.data.model.Resume
import java.io.File
import java.io.FileOutputStream
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PdfGenerator @Inject constructor() {
    
    fun generatePdf(context: Context, resume: Resume): File {
        val fileName = "${resume.getResumeTitle().replace(" ", "_")}.pdf"
        val file = File(context.getExternalFilesDir(null), fileName)
        
        val pdfWriter = PdfWriter(FileOutputStream(file))
        val pdfDocument = PdfDocument(pdfWriter)
        val document = Document(pdfDocument)
        
        // Add title
        val title = Paragraph(resume.basicInfo.getDisplayName())
            .setTextAlignment(TextAlignment.CENTER)
            .setFontSize(24f)
        document.add(title)
        
        // Add contact information
        val contactInfo = Paragraph()
            .setTextAlignment(TextAlignment.CENTER)
            .setFontSize(12f)
        
        if (resume.basicInfo.email.isNotBlank()) {
            contactInfo.add(Text("Email: ${resume.basicInfo.email}"))
        }
        if (resume.basicInfo.phoneNumber.isNotBlank()) {
            contactInfo.add(Text(" | Phone: ${resume.basicInfo.phoneNumber}"))
        }
        if (resume.basicInfo.linkedInProfile.isNotBlank()) {
            contactInfo.add(Text(" | LinkedIn: ${resume.basicInfo.linkedInProfile}"))
        }
        
        document.add(contactInfo)
        document.add(Paragraph())
        
        // Add summary
        if (resume.basicInfo.summary.isNotBlank()) {
            document.add(Paragraph("Summary").setFontSize(16f))
            document.add(Paragraph(resume.basicInfo.summary))
            document.add(Paragraph())
        }
        
        // Add education
        if (resume.education.isNotEmpty()) {
            document.add(Paragraph("Education").setFontSize(16f))
            resume.education.forEach { education ->
                val eduParagraph = Paragraph()
                    .add(Text(education.degree).setBold())
                    .add(Text(" - ${education.schoolName}"))
                document.add(eduParagraph)
                
                if (education.major.isNotBlank()) {
                    document.add(Paragraph("Major: ${education.major}"))
                }
                if (education.gpa.isNotBlank()) {
                    document.add(Paragraph("GPA: ${education.gpa}"))
                }
                document.add(Paragraph("${education.getDateRange()}"))
                document.add(Paragraph())
            }
        }
        
        // Add experience
        if (resume.experience.isNotEmpty()) {
            document.add(Paragraph("Experience").setFontSize(16f))
            resume.experience.forEach { experience ->
                val expParagraph = Paragraph()
                    .add(Text(experience.position).setBold())
                    .add(Text(" at ${experience.companyName}"))
                document.add(expParagraph)
                
                document.add(Paragraph(experience.getDateRange()))
                if (experience.description.isNotBlank()) {
                    document.add(Paragraph(experience.description))
                }
                document.add(Paragraph())
            }
        }
        
        // Add skills
        if (resume.skills.isValid()) {
            document.add(Paragraph("Skills").setFontSize(16f))
            
            if (resume.skills.technicalSkills.isNotEmpty()) {
                document.add(Paragraph("Technical Skills: ${resume.skills.technicalSkills.joinToString(", ")}"))
            }
            if (resume.skills.softSkills.isNotEmpty()) {
                document.add(Paragraph("Soft Skills: ${resume.skills.softSkills.joinToString(", ")}"))
            }
            document.add(Paragraph())
        }
        
        document.close()
        return file
    }
}
