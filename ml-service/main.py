from fastapi import FastAPI
from pydantic import BaseModel

app = FastAPI(title="Healthcare AI Risk Prediction API")

class PatientData(BaseModel):
    age: int
    glucose: float
    blood_pressure: float
    hemoglobin: float
    cholesterol: float


@app.get("/")
def home():
    return {"message": "ML Service Running"}


@app.post("/predict")
def predict(data: PatientData):

    # temporary dummy prediction
    diabetes_risk = 0.65
    heart_risk = 0.40
    anemia_risk = 0.72
    hypertension_risk = 0.55

    return {
        "diabetes_risk": diabetes_risk,
        "heart_disease_risk": heart_risk,
        "anemia_risk": anemia_risk,
        "hypertension_risk": hypertension_risk
    }