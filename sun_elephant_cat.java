import java.io.*;

public class WinWinProject {
	
	public static void main (String[] args) {
		
		// Create a sustainable business plan that focuses on social missions 
		BusinessPlan plan = new BusinessPlan();
		plan.setMission(SocialMission.ENVIRONMENT);
		plan.setSustainabilityStrategy(SustainabilityStrategy.BENEFIT_COMMUNITY);
		
		// Identify and implement eco-friendlier practices
		EcoFriendlyPractices efp = new EcoFriendlyPractices();
		efp.setReusableProducts(true);
		efp.setRecycledMaterials(true);
		efp.setReducedPackage(true);
		efp.setReducedEnergyUsage(true);
		
		// Reduce emissions from transportation
		TransportationEmissions te = new TransportationEmissions();
		te.setReducedFuelConsumption(true);
		te.setOptimizedRoutePlanning(true);
		te.setCarpooling(true);
		
		// Develop a support system to help local communities
		LocalCommunitySupport lcs = new LocalCommunitySupport();
		lcs.setProvideJobTraining(true);
		lcs.setProvideEducation(true);
		lcs.setDonateToCharity(true);
		
		// Create a marketing campaign for the project
		MarketingCampaign mc = new MarketingCampaign();
		mc.setSocialMediaMarketing(true);
		mc.setPrintAdvertising(true);
		mc.setBroadcastAdvertising(true);
		
		// Monitor progress and adjust plans accordingly
		ProgressMonitor pm = new ProgressMonitor();
		pm.setTrackEcoFriendlyOutcomes(true);
		pm.setTrackFinancialOutcomes(true);
		pm.setTrackSocialOutcomes(true);
		
		// Develop a reporting system for project outcomes
		OutcomesReporting or = new OutcomesReporting();
		or.setCreateProgressReport(true);
		or.setReviewReportsPeriodically(true);
		or.setMakeChangesAsNeeded(true);
		
		// Identify and reduce waste streams
		WasteStreamReduction wsr = new WasteStreamReduction();
		wsr.setReducePackaging(true);
		wsr.setRecycleOrReuseMaterials(true);
		wsr.setImplementCompostingSystem(true);
		
		// Develop plans for resource conservation
		ResourceConservation rc = new ResourceConservation();
		rc.setReduceWaterUsage(true);
		rc.setReduceElectricityUsage(true);
		rc.setReduceFuelUsage(true);
		
		// Use renewable energy sources as much as possible
		RenewableEnergy re = new RenewableEnergy();
		re.setSolarPower(true);
		re.setWindPower(true);
		re.setGeothermalPower(true);
		
		// Implement practices that promote sustainable development
		SustainableDevelopment sd = new SustainableDevelopment();
		sd.setIntegrateEconomicGrowthWithSocialAndEnvironmentalConcerns(true);
		sd.setFosterCommunityInvolvementAndParticipation(true);
		sd.setSupportEnvironmentalStewardship(true);
		
		// Evaluate the progress of the project
		EvaluateProgress ep = new EvaluateProgress();
		ep.setDetermineIfProjectGoalsAreBeingMet(true);
		ep.setCompareResultsToBenchmarks(true);
		ep.setMakeSuggestedChangesAsNeeded(true);
		
		// Create a strategy to spread the message of sustainability
		SustainabilityStrategy ss = new SustainabilityStrategy();
		ss.setEducatePublicAboutProject(true);
		ss.setEncourageCommunityInvolvement(true);
		ss.setCreateEventsToSpreadTheMessage(true);
		
		// Analyze data and update plans appropriately
		DataAnalysis da = new DataAnalysis();
		da.setAnalyzeProgressReports(true);
		da.setIdentifyNeededChanges(true);
		da.setImplementChangesAsNeeded(true);
		
		// Rewarding employees who go above and beyond
		EmployeeReward er = new EmployeeReward();
		er.setCreateIncentivesForEcoFriendlyBehavior(true);
		er.setAwardBonusesForContributions(true);
		er.setRecognizeOutstandingAchievements(true);
		
		// Develop plans for future growth
		FutureGrowth fg = new FutureGrowth();
		fg.setEvaluateSuccessfulProjects(true);
		fg.setIdentifyPotentialGrowthAreas(true);
		fg.setCreateStrategiesToAchieveGoals(true);
		
		// Monitor the project and adjust plans accordingly
		ProjectMonitor pm2 = new ProjectMonitor();
		pm2.setTrackProgress(true);
		pm2.setMakeSuggestedChanges(true);
		pm2.setAdjustPlanningStrategy(true);
		
		// Create a metrics system to measure success
		MetricsSystem ms = new MetricsSystem();
		ms.setMeasureEnvironmentalImpact(true);
		ms.setMeasureFinancialImpact(true);
		ms.setMeasureSocialImpact(true);
		
		// Implement a feedback system
		FeedbackSystem fs = new FeedbackSystem();
		fs.setSolicitClientFeedback(true);
		fs.setSolicitEmployeeFeedback(true);
		fs.setSolicitCommunityFeedback(true);
		
	}
	
	
	public static class BusinessPlan {
		
		private SocialMission mission;
		private SustainabilityStrategy strategy;
		
		public void setMission(SocialMission mission) {
			this.mission = mission;
		}
			
		public void setSustainabilityStrategy(SustainabilityStrategy strategy) {
			this.strategy = strategy;
		}
	}
	
	public enum SocialMission {
		ENVIRONMENT, COMMUNITY, EDUCATION, HEALTHCARE
	}
	
	public enum SustainabilityStrategy {
		BENEFIT_COMMUNITY, BENEFIT_ENVIRONMENT, BOTH
	}
	
	public static class EcoFriendlyPractices {
		
		private boolean reusableProducts;
		private boolean recycledMaterials;
		private boolean reducedPackage;
		private boolean reducedEnergyUsage;
		
		public void setReusableProducts(boolean reusableProducts) {
			this.reusableProducts = reusableProducts;
		}
		
		public void setRecycledMaterials(boolean recycledMaterials) {
			this.recycledMaterials = recycledMaterials;
		}
		
		public void setReducedPackage(boolean reducedPackage) {
			this.reducedPackage = reducedPackage;
		}
		
		public void setReducedEnergyUsage(boolean reducedEnergyUsage) {
			this.reducedEnergyUsage = reducedEnergyUsage;
		}
		
	}
	
	public static class TransportationEmissions {
		
		private boolean reducedFuelConsumption;
		private boolean optimizedRoutePlanning;
		private boolean carpooling;
		
		public void setReducedFuelConsumption(boolean reducedFuelConsumption) {
			this.reducedFuelConsumption = reducedFuelConsumption;
		}
		
		public void setOptimizedRoutePlanning(boolean optimizedRoutePlanning) {
			this.optimizedRoutePlanning = optimizedRoutePlanning;
		}
		
		public void setCarpooling(boolean carpooling) {
			this.carpooling = carpooling;
		}
		
	}
	
	public static class LocalCommunitySupport {
		
		private boolean provideJobTraining;
		private boolean provideEducation;
		private boolean donateToCharity;
		
		public void setProvideJobTraining(boolean provideJobTraining) {
			this.provideJobTraining = provideJobTraining;
		}
		
		public void setProvideEducation(boolean provideEducation) {
			this.provideEducation = provideEducation;
		}
		
		public void setDonateToCharity(boolean donateToCharity) {
			this.donateToCharity = donateToCharity;
		}
		
	}
	
	public static class MarketingCampaign {
		
		private boolean socialMediaMarketing;
		private boolean printAdvertising;
		private boolean broadcastAdvertising;
		
		public void setSocialMediaMarketing(boolean socialMediaMarketing) {
			this.socialMediaMarketing = socialMediaMarketing;
		}
		
		public void setPrintAdvertising(boolean printAdvertising) {
			this.printAdvertising = printAdvertising;
		}
		
		public void setBroadcastAdvertising(boolean broadcastAdvertising) {
			this.broadcastAdvertising = broadcastAdvertising;
		}
		
	}
	
	public static class ProgressMonitor {
		
		private boolean trackEcoFriendlyOutcomes;
		private boolean trackFinancialOutcomes;
		private boolean trackSocialOutcomes;
		
		public void setTrackEcoFriendlyOutcomes(boolean trackEcoFriendlyOutcomes) {
			this.trackEcoFriendlyOutcomes = trackEcoFriendlyOutcomes;
		}
		
		public void setTrackFinancialOutcomes(boolean trackFinancialOutcomes) {
			this.trackFinancialOutcomes = trackFinancialOutcomes;
		}
		
		public void setTrackSocialOutcomes(boolean trackSocialOutcomes) {
			this.trackSocialOutcomes = trackSocialOutcomes;
		}
		
	}
	
	public static class OutcomesReporting {
		
		private boolean createProgressReport;
		private boolean reviewReportsPeriodically;
		private boolean makeChangesAsNeeded;
		
		public void setCreateProgressReport(boolean createProgressReport) {
			this.createProgressReport = createProgressReport;
		}
		
		public void setReviewReportsPeriodically(boolean reviewReportsPeriodically) {
			this.reviewReportsPeriodically = reviewReportsPeriodically;
		}
		
		public void setMakeChangesAsNeeded(boolean makeChangesAsNeeded) {
			this.makeChangesAsNeeded = makeChangesAsNeeded;
		}
		
	}
	
	public static class WasteStreamReduction {
		
		private boolean reducePackaging;
		private boolean recycleOrReuseMaterials;
		private boolean implementCompostingSystem;
		
		public void setReducePackaging(boolean reducePackaging) {
			this.reducePackaging = reducePackaging;
		}
		
		public void setRecycleOrReuseMaterials(boolean recycleOrReuseMaterials) {
			this.recycleOrReuseMaterials = recycleOrReuseMaterials;
		}
		
		public void setImplementCompostingSystem(boolean implementCompostingSystem) {
			this.implementCompostingSystem = implementCompostingSystem;
		}
		
	}
	
	public static class ResourceConservation {
		
		private boolean reduceWaterUsage;
		private boolean reduceElectricityUsage;
		private boolean reduceFuelUsage;
		
		public void setReduceWaterUsage(boolean reduceWaterUsage) {
			this.reduceWaterUsage = reduceWaterUsage;
		}
		
		public void setReduceElectricityUsage(boolean reduceElectricityUsage) {
			this.reduceElectricityUsage = reduceElectricityUsage;
		}
		
		public void setReduceFuelUsage(boolean reduceFuelUsage) {
			this.reduceFuelUsage = reduceFuelUsage;
		}
		
	}
	
	public static class RenewableEnergy {
		
		private boolean solarPower;
		private boolean windPower;
		private boolean geothermalPower;
		
		public void setSolarPower(boolean solarPower) {
			this.solarPower = solarPower;
		}
		
		public void setWindPower(boolean windPower) {
			this.windPower = windPower;
		}
		
		public void setGeothermalPower(boolean geothermalPower) {
			this.geothermalPower = geothermalPower;
		}
		
	}
	
	public static class SustainableDevelopment {
		
		private boolean integrateEconomicGrowthWithSocialAndEnvironmentalConcerns;
		private boolean fosterCommunityInvolvementAndParticipation;
		private boolean supportEnvironmentalStewardship;
		
		public void setIntegrateEconomicGrowthWithSocialAndEnvironmentalConcerns(boolean integrateEconomicGrowthWithSocialAndEnvironmentalConcerns) {
			this.integrateEconomicGrowthWithSocialAndEnvironmentalConcerns = integrateEconomicGrowthWithSocialAndEnvironmentalConcerns;
		}
		
		public void setFosterCommunityInvolvementAndParticipation(boolean fosterCommunityInvolvementAndParticipation) {
			this.fosterCommunityInvolvementAndParticipation = fosterCommunityInvolvementAndParticipation;
		}
		
		public void setSupportEnvironmentalStewardship(boolean supportEnvironmentalStewardship) {
			this.supportEnvironmentalStewardship = supportEnvironmentalStewardship;
		}
		
	}
	
	public static class EvaluateProgress {
		
		private boolean determineIfProjectGoalsAreBeingMet;
		private boolean compareResultsToBenchmarks;
		private boolean makeSuggestedChangesAsNeeded;
		
		public void setDetermineIfProjectGoalsAreBeingMet(boolean determineIfProjectGoalsAreBeingMet) {
			this.