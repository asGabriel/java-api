import { IsNotEmpty, IsString } from "class-validator"

export class StatementEntityDto {
    @IsNotEmpty()
    @IsString()
    PHOTO: string

    @IsNotEmpty()
    @IsString()
    STATEMENT: string
    
    @IsNotEmpty()
    @IsString()
    CREATEDBY: string
}